<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	var item = '${v3x:currentUser().groupAdmin?2003:3311}';
	getA8Top().showLocation(item);
	<%--新建--%>
	function add(){
		var accountId;
		if(parent.treeFrame != null){
			accountId = parent.treeFrame.root.getSelected().businessId;
		} else {
			accountId = '${v3x:currentUser().loginAccount}';
		}
		parent.listFrame.detailFrame.location.href="${ipcontrolURL}?method=create&accountId="+accountId;
	}
	function getSelectId(){
		var ids=parent.listFrame.list.document.getElementsByName('id');
		var id='';
		for(var i=0;i<ids.length;i++){
			var idCheckBox=ids[i];
			if(idCheckBox.checked){
				id=idCheckBox.value;
				break;
			}
		}
		return id;
	}
	function validateCheckBox(id){
		var id_checkbox = parent.listFrame.list.document.getElementsByName(id);
		if (!id_checkbox) {
	        return 0;
	    }
	    var count = 0;
	    var len = id_checkbox.length;
	    for (var i = 0; i < len; i++) {
	        if (id_checkbox[i].checked) {
	        	count++;
	        }
	    }
	    return count;
	}
	<%--修改--%>
	function modify(){
		var count = validateCheckBox('id');
		var accountId;
		if(parent.treeFrame != null){
			accountId = parent.treeFrame.root.getSelected().businessId;
		} else {
			accountId = '${v3x:currentUser().loginAccount}';
		}
		switch(count){
		case 0:
				alert(v3x.getMessage("sysMgrLang.choose_item_from_list"));  
				return false;
				break;
		case 1:
				var id = getSelectId();
				parent.listFrame.detailFrame.location.href = "${ipcontrolURL}?method=create&id=" + id + "&accountId=" + accountId;
				break;
		default:
				alert(v3x.getMessage("sysMgrLang.choose_one_only"));
				return false;
		}
	}
	<%--删除--%>
	function removeItem(){
		var accountId;
		if(parent.treeFrame != null){
			accountId = parent.treeFrame.root.getSelected().businessId;
		} else {
			accountId = '${v3x:currentUser().loginAccount}';
		}
		var count = validateCheckBox('id');
		if(count > 0){
			if(confirm(v3x.getMessage("sysMgrLang.delete_sure"))){
				parent.listFrame.list.document.getElementById('ipform').action = "${ipcontrolURL}?method=delete&accountId=" + accountId;
				parent.listFrame.list.document.getElementById('ipform').submit();
			}
		}
		else{
			alert(v3x.getMessage("sysMgrLang.choose_item_from_list"));  
			return;
		}
	}
	
	function showNextSpecialCondition(conditionObject) {
		var options = conditionObject.options;
		for (var i = 0; i < options.length; i++) {
		    var d = document.getElementById(options[i].value + "Div");
		    if (d) {
		        d.style.display = "none";
		 	}
		}
		if(document.getElementById(conditionObject.value + "Div") == null) {
			return;
		}
		document.getElementById(conditionObject.value + "Div").style.display = "block";
	
	}
	/**
	 * 搜索按钮事件
	 */
	function doSearch() {
		var accountId;
		if(parent.treeFrame != null){
			accountId = parent.treeFrame.root.getSelected().businessId;
		} else {
			accountId = '${v3x:currentUser().loginAccount}';
		}
	    var oTheForm = document.getElementById("searchForm");
	    var oCondition = oTheForm.condition;
	    if (oTheForm) {
	    	if(oCondition.value == 'name'){	    	    
	    		parent.listFrame.list.location.href='${ipcontrolURL}?method=list&search=search&name='+encodeURI(document.getElementById('nameTextField').value) + "&id="+accountId;
	    	}else if(oCondition.value == 'account'){
	    		parent.listFrame.list.location.href='${ipcontrolURL}?method=list&search=search&accountId='+encodeURI(document.getElementById('accountTextField').value) + "&id="+accountId;
	    	}else if(oCondition.value == 'type'){
	    		parent.listFrame.list.location.href='${ipcontrolURL}?method=list&search=search&type='+encodeURI(document.getElementById('typeValue').value) + "&id="+accountId;
	    	} else if(oCondition.value=='memberIds'){ // 诚佰公司 添加授权对象过滤
	    		parent.listFrame.list.location.href='${ipcontrolURL}?method=list&search=search&memberIds='+encodeURI(document.getElementById('selectPersonIds').value) + "&id="+accountId;
	    	}
	    }
	}
	function setPeopleFields(elements){
		var element = elements[0];
		document.getElementById("accountName").value = element.name;
		document.getElementById("accountTextField").value = element.id;
	}
	
	<!-- 诚佰公司 添加人员选择回调事件 -->
	function dataToColony(elements){
	    if (!elements) {
	        return false;
	    }
	    var objectIds = getIdsString(elements);
	    var objectNames = getNamesString(elements);
	    //for(var i=0; i<elements.length; i++){
	    //	objectIds += elements[i].type + "|" + elements[i].id + "|1,"; //TODO
	    //}
	    
	    document.getElementById("selectPersonIds").value = objectIds;
	    document.getElementById("personIds").value = objectNames;
	    document.getElementById("personIds").title = objectNames;
	}
</script>
</head>
<body>
<v3x:selectPeople id="account" panels="Account" selectType="Account" jsFunction="setPeopleFields(elements);" maxSize="1" />
<!-- 2017-5-24 诚佰公司 添加人员参选控件 -->
<v3x:selectPeople id="user" panels="Department" selectType="Member,Department,Account" jsFunction="dataToColony(elements)" viewPage="${viewPage}" minSize="0" maxSize="1" />
<!-- 诚佰公司 -->
<table height="26" width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td height="26" class="border-top webfx-menu-bar">
			<script type="text/javascript" id="writeBar">
				var myBar = new WebFXMenuBar("<c:out value='${pageContext.request.contextPath}' />", "blue");
				myBar.add(new WebFXMenuButton("add","<fmt:message key='common.toolbar.new.label' bundle='${v3xCommonI18N}'/>","add()",[1,1], "",null));
				myBar.add(new WebFXMenuButton("mod","<fmt:message key='common.toolbar.update.label' bundle='${v3xCommonI18N}'/>","modify()",[1,2],"", null));
				myBar.add(new WebFXMenuButton("del","<fmt:message key='common.toolbar.delete.label' bundle='${v3xCommonI18N}'/>","removeItem()",[1,3],"", null));
				document.write(myBar);
		    	document.close();
	    	</script>
    	</td>
		<td class="webfx-menu-bar border-top">
			<form action="" name="searchForm" id="searchForm" method="get" onkeypress="doSearchEnter()" onsubmit="return false">
				<div class="div-float-right">
					<div class="div-float">
						<select name="condition" id="condition" onChange="showNextSpecialCondition(this)" class="condition">
					    	<option value=""><fmt:message key="common.option.selectCondition.text" bundle="${v3xCommonI18N}" /></option>
					    	<option value="name"><fmt:message key="common.name.label" bundle="${v3xCommonI18N}" /></option>
					    	<c:if test="${v3x:currentUser().groupAdmin}">
					    	<option value="account"><fmt:message key="org.account_form.name.label" bundle="${organizations}"/></option>
					    	</c:if>
						    <option value="type"><fmt:message key="common.type.label" bundle="${v3xCommonI18N}" /></option>
						    <!-- 2017-5-24 诚佰公司 添加授权对象过滤 -->
						    <option value="memberIds" <c:if test="${condition == 'memberIds' }">selected</c:if>>授权对象</option>
					  	</select>
				  	</div>
				  	<div id="nameDiv" class="div-float hidden">
				  		<input type="text" name="nameTextField" id='nameTextField' class="textfield" value="">
				  	</div>
				  	<fmt:message key="common.default.selectDepartment.value" var="defaultSP" bundle="${v3xCommonI18N}"/>
				  	<c:if test="${v3x:currentUser().groupAdmin}">
				  	<div id="accountDiv" class="div-float hidden">
						<input type='text' id="accountName" class='cursor-hand textfield' name='accountName' onclick='selectPeopleFun_account()' deaultValue="${defaultSP}" value='' readonly />
				  		<input type="hidden" name="accountTextField" id='accountTextField' class="textfield">
				  	</div>
				  	</c:if>
				  	<div id="typeDiv" class="div-float hidden">
				  		<select name="typeValue" id="typeValue">
				  			<option value="0"><fmt:message key="system.ipcontrol.limit" /></option>
				  			<option value="1"><fmt:message key="system.ipcontrol.nolimit" /></option>
				  		</select>
				  	</div>
				  	<!-- 2017-5-24 诚佰公司 添加按授权对象过滤 -->
				  	<div id="memberIdsDiv" class="div-float hidden">
						 <input type="text" readonly="readonly" class="cursor-hand"  onclick="selectPeopleFun_user()" id="personIds"  name="personIds" title="" value="">
		        		 <input type="hidden" name="selectPersonIds" id="selectPersonIds" value="">
				  	</div>
				  	<!-- 2017-5-24 诚佰公司 -->
				  	<div onclick="javascript:doSearch()" class="condition-search-button div-float"></div>
			  	</div>
			</form>
		</td>
	</tr>
</table>
</body>
</html>