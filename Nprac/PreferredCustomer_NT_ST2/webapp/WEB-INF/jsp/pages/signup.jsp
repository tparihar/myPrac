<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script>
function getStateList(e,stateElementId,store_addressId){
	$("#"+store_addressId).html('<option value=0>select store</option>');
	$("#"+store_addressId).prop( "disabled", true );
	 if(e.value==0){
		 $("#"+stateElementId).html('<option value=0>select state</option>');
		 $("#"+stateElementId).prop( "disabled", true );
		
		 return true;
	} 
	 
	 $("#"+stateElementId).prop( "disabled", false );
	$.ajax({
		method: "GET",
		  url: "getStateList",
		  data: { country: e.value}
		}).done(function(data) {
			console.log(data);
		 $("#"+stateElementId).html(data);
		});
	

}

$(document).ready(function(){
	
	
	
	$("#store_state").change(function(){
		if(this.value==0){
			 $("#store_address").prop( "disabled", true );
			 $("#store_address").html('<option value=0>select store</option>');
			 return true;
		}
		var countryId=$("#store_country").val();
		$("#store_address").prop( "disabled", false );
		$.ajax({
			method: "GET",
			  url: "getStoreList",
			  data: { store_country: countryId,store_state:this.value}
			}).done(function(data) {
				console.log(data);
			 $("#store_address").html(data);
			});
		
		});
	
	/* $(".country_droplist").change(function(){
		
		$.ajax({
			method: "GET",
			  url: "signup/getStateList",
			  data: {country:this.value}
			}).done(function(data) {
				console.log(data);
			 $("#store_state").html(data);
			});
		
		}); */
	
/* 	$(".tblContent .bullets").click(function(){
		var idValue=$(this).attr("id");
		console.log(idValue);
		$(".tblContent").hide();
		if(idValue=="lbtnNext1"){
			 $("#tb2").show();
		}else if(idValue=="lbtnNext2"){
			 $("#tb3").show();
		
		}else if(idValue=="lbtnPrev2"){
			 $("#tb1").show();
		}else if(idValue=="lbtnPrev3"){
			 $("#tb2").show();
		}
		
	})
	
		$(".tblContent #prev2").click(function(){
		$(".tblContent").hide();
		$("#tb1").show();
		
		
	}) */
	
	
});
</script>
	
	<form:form action="do" modelAttribute="memberDetails" method="post"> 	
		




		
		

						<table width="100%" >


							<div id="pnlRWODisp">

								<tr>
									<td><span id="lblCont2" class="title">SIGN UP FOR
											THE PREFERRED PROGRAM</span></td>
								</tr>

							</div>
							<tr>
								<td>&nbsp;</td>
							</tr>

							<div id="pnlRegWCardDisp">

								<tr>
									<td class="contents"><span id="lblCont4">please
											complete the following registration form to become a
											preferred program member.</span></td>
								</tr>

							</div>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="80%" class="border" cellpadding="10px">
							<tr align="center">
								<td>
									<div id="mainContentHolderDiv" class="mainContentHolderDiv" 
										style="width: 100%;">
										<table id="tb1" class="tblMain tblContent" cellpadding="3px">
											<tr>
												<td align="left"><span id="lblCont6"
													style="font-weight: bold;">* indicates mandatory
														fields
														
														</span></td>
											</tr>
											<tr>
												<td align="left">&nbsp;</td>
											</tr>



											<tr>
												<td>&nbsp;</td>
											</tr>

											<tr>
												<td align="right" style="width: 262px"><span
													id="lblPickStore" class="contents">select your home
														store</span></td>
												<td align="left" colspan="2">
													


													<div id="UpdatePanel1">

														<jsp:include page="views/countries.jsp"/>
														
                                                            <form:select path="store.state.id" 
															id="store_state" tabindex="2" class="textbox">
															 <option value="0">select state</option>
														    </form:select> &nbsp;*<br />

													</div>
												</td>
											</tr>

											<tr>
												<td></td>
												<td align="left" colspan="2">
													<div id="UpdatePanel3">

														
															<jsp:include page="views/storedropdown.jsp"/>
															

													


													</div>
												</td>
											</tr>
											<tr>
												<td></td>
												<td colspan="2" align="left">
												<span id="lblCont9">
												<form:errors path="store.*" cssClass="error"  element="span" />
												</span>
												</td>
											</tr>
											<tr>
											
												<td colspan="3" align="left"><span id="lblCont9">(your
														home store selection should be the store that you shop the
														most frequently. proper home store selection ensures you
														receive special promotions for the location nearest you. )</span>
												</td>
											</tr>

											

											<tr>
												<td align="left" colspan="3" class="contents"><b> <span
														id="lblPassCreate">password for your preferred
															account</span></b></td>
											</tr>

											<tr>
												<td align="right" style="width: 262px"><span
													id="lblPassword" class="contents">username</span></td>
												<td align="left">
												<form:input path="account.username" name="username" type="text"	maxlength="10" id="username" tabindex="4" class="textbox"/>
												<form:errors path="account.username" cssClass="error"  element="span" />
												</td>	
											</tr>
											<tr>
												<td align="right" style="width: 262px"><span
													id="lblPassword" class="contents">password</span></td>
												<td align="left">
												<form:input path="account.password" name="password" type="password"	maxlength="10" id="password" tabindex="4" class="textbox" />
												<form:errors path="account.password" cssClass="error" />	

											</tr>

											<tr>
												<td style="width: 262px"></td>
												<td colspan="2" align="left"><span id="lblCont13">password
														should be between 8-10 characters</span></td>
											</tr>

										

											<tr>
												<td colspan="3">&nbsp;</td>
											</tr>

										

										

										
												<tr>
													<td align="left" colspan="3" class="contents"><b> <span
														id="lblPassCreate">User information</span></b></td>
												</tr>
												<tr>
													<td align="left">&nbsp;</td>
												</tr>



												<tr>
													<td>&nbsp;</td>
												</tr>


												<tr>
													<td class="contents" align="right"><span id="lblFnm"
														class="contents">first name</span></td>
													<td style="height: 26px" align="left">
													
													<form:input	path="firstname"  maxlength="200" id="firstname" tabindex="9" class="textbox" type="text"/> * 
													<form:errors path="lastname" cssClass="error" />
													</td>
													<td style="height: 26px" align="left"></td>
												</tr>

												<tr>
													<td class="contents" align="right"><span id="lblLnm"
														class="contents">last name</span></td>
													<td align="left">
													
													<form:input path="lastname" name="lastname" maxlength="200"	id="lastname" tabindex="10" class="textbox" type="text"/> * 
													<form:errors path="lastname" cssClass="error" />
													</td>
													<td align="left"></td>
												</tr>

												<tr>
													<td class="contents" align="right"><span
														id="lblCont10">country/state:</span></td>
													<td colspan="2" align="left">
														<div id="UpdatePanel2">

															<form:select path="address.country.id" 
																onChange="getStateList(this,'member_state')"
																id="member_country" tabindex="11" class="textbox"
																style="width: 200px;">
																
																<option value="0">select country</option>
		
																<c:forEach items="${countries}" var="country">   
																<option value="${country.id}">${country.name}</option>
																</c:forEach> 
																

															</form:select> &nbsp; 
															
															<form:select path="address.state.id"  id="member_state"
																tabindex="12" class="textbox" style="width: 220px;">
																<option value="0">select state</option>

															</form:select> &nbsp;*
															
														</div>
													</td>
													<td align="left"></td>
												</tr>
  												<tr>
  												<td class="contents" align="right"></td>
											    <td  align="left"><span style="float:left"><form:errors path="address.country.id" cssClass="error" /></span><span style="float:right;padding-right:50px"><form:errors path="address.state.id" cssClass="error" /></span></td>
													 <td align="left"></td>
											    <td align="left"></td>
											    </tr>
												<tr>
													<td colspan="2">
														<div id="updPnlAddr1">

															<table id="Table1" style="width: 100%;" border="0"
																cellpadding="0" cellspacing="3">
																<tbody>
																	<tr id="rowAddr1">
																		<td id="TableCell1" class="tableCellRightAligned"
																			style="width: 362px;"><span id="lblAddress1"
																			class="contents">address 1</span></td>
																		<td id="TableCell2" class="tableCellLeftAligned">
																		<form:input path="address.address1"	name="address1" maxlength="255" id="address1"
																			tabindex="13" class="textbox" type="text"/>&nbsp;*
																			<form:errors path="address.address1" cssClass="error" />
																		</td>
																	</tr>
																</tbody>
															</table>

														</div>
													</td>
													<td align="left"></td>
												</tr>

												<tr>
													<td colspan="3">
														<div id="updPnlAddr2">

															<table id="Table2" style="width: 100%;" border="0"
																cellpadding="0" cellspacing="3">
																<tbody>
																	<tr id="rowAddr2">
																		<td id="TableCell3" class="tableCellRightAligned"
																			style="width: 362px;"><span id="lblAddress2"
																			class="contents">address 2</span></td>
																		<td id="TableCell4" class="tableCellLeftAligned">
																		<form:input path="address.address2"	 maxlength="255" id="address2"
																			tabindex="14" class="textbox" type="text"/>
																		<form:errors path="address.address2" cssClass="error" />	
																			</td>
																	</tr>
																</tbody>
															</table>

														</div>
													</td>
												</tr>

												<tr>
													<td colspan="2">
														<div id="updPnlCity">

															<table id="Table3" style="width: 100%;" border="0"
																cellpadding="0" cellspacing="3">
																<tbody>
																	<tr id="rowCity">
																		<td id="TableCell5" class="tableCellRightAligned"
																			style="width: 362px"><span id="lblCity"
																			class="contents">city</span></td>
																		<td id="TableCell6" class="tableCellLeftAligned">
																		<form:input path="address.city"	 maxlength="200" id="city"
																			tabindex="15" class="textbox" type="text"/>&nbsp;*
																			<form:errors path="address.city" cssClass="error"/>
																		</td>
																	</tr>
																</tbody>
															</table>

														</div>
													</td>

													<td align="left"></td>
												</tr>

												<tr>
													<td colspan="2">
														<div id="updPnlZip">

															<table id="Table4" style="width: 100%;" border="0"
																cellpadding="0" cellspacing="3">
																<tbody>
																	<tr id="rowZip">
																		<td id="TableCell7" class="tableCellRightAligned"
																			style="width: 362px"><span id="lblZip"
																			class="contents">zip</span></td>
																		<td id="TableCell8" class="tableCellLeftAligned">
																		<form:input path="address.zip"	maxlength="7" id="zip" tabindex="16"
																			class="textbox" type="text"/>&nbsp;*
																			<form:errors path="address.zip" cssClass="error"/>
																			 </td>
																	</tr>
																</tbody>
															</table>

														</div>
													</td>
													<td align="left"></td>
												</tr>

												<tr>
													<td style="width: 362px" align="right"><span
														id="lblEmail" class="contents">email</span></td>
													<td align="left">
														<div id="UpdatePanel10">

															<form:input path="email" name="email" maxlength="255" id="email" tabindex="17" class="textbox" type="text"/>&nbsp;* 
															<form:errors path="email" cssClass="error"/>
														</div>

													</td>
													<td align="left"></td>

												</tr>

												<tr>
													<td>&nbsp;</td>
													<td colspan="2" align="left"><span
														id="lblEmailmsgDisp">(your email address is your
															user name for login purposes)</span></td>
												</tr>

												<tr>
													<td class="contents" align="right"><span
														id="lblConfirmEmail" class="contents">confirm email</span>
													</td>
													<td align="left"><input name="confirm_email"
														maxlength="255" id="confirm_email" tabindex="18"
														class="textbox" onmousedown="return noCopyMouse(event);"
														onkeydown="return noCopyKey(event);" type="text">
															* </td>
													<td align="left"></td>
												</tr>

												<tr>
													<td colspan="3">
														<div id="updPnlPhone">

															<table id="Table5" style="width: 100%;" border="0"
																cellpadding="0" cellspacing="3">
																<tbody>
																	<tr id="rowPhone">
																		<td id="TableCell9" class="tableCellRightAligned"
																			style="width: 362px"><span id="lblPhone"
																			class="contents">phone</span></td>
																		<td id="TableCell10" class="tableCellLeftAligned">
																		
																		<form:input path="phone" name="phone" maxlength="100" id="phone" tabindex="19" class="textbox" type="text"/>&nbsp;*
																		<form:errors path="phone" cssClass="error"/>
																		</td>
																		<td id="TableCell11"></td>
																	</tr>
																</tbody>
															</table>

														</div>
													</td>

												</tr>

												<tr>
													<td>&nbsp;</td>
													<td colspan="2" align="left">
														<div id="updPnlPhoneMsg">

															<table id="Table6"
																style="width: 100%; border-collapse: collapse;"
																border="0" cellpadding="0" cellspacing="0">
																<tbody>
																	<tr id="rowPhoneMsg">
																		<td id="TableCell12"><span id="lblPhoneMsg">(we
																				only use phone number to look up your account in
																				stores if you don't have your preferred card.)</span></td>
																	</tr>
																</tbody>
															</table>

														</div>
													</td>
												</tr>
												<tr>
													<td colspan="3">&nbsp;</td>
												</tr>
											

											
				
												<tr>
													<td align="left"><span style="font-weight: bold;"
														id="lblCont6">* indicates mandatory fields</span></td>
												</tr>
												<tr>
													<td align="left">&nbsp;</td>
												</tr>



												<tr>
													<td>&nbsp;</td>
												</tr>


												<tr>
													<td align="right"><span class="contents"
														id="lblGender">gender</span></td>
													<td align="left" colspan="2">
													 <c:forEach items="${genderTypes}" var="gender" varStatus="status">
												        <span class="radio">
														<form:radiobutton path="profile.gender"  tabindex="22" value="${gender.key}" name="gender"	id="${gender.value}"/>
														<label for="${gender.value}">${gender.value}</label>
													</span> 
												    </c:forEach>
												    <form:errors path="profile.gender" cssClass="error"/>
													<%-- <span class="radio">
													<form:radiobutton path="gender"  tabindex="22" value="${gender.key}" name="gender"	id="${gender.value}"/>
													<label for="${gender.value}">${gender.value}</label>
													</span> 
													<span class="radio">
													<input type="radio" tabindex="23" value="f" name="gender" id="female">
													<label for="female">female</label>
													</span> --%>
													</td>
												</tr>

												<tr>
													<td align="right"><span class="contents" id="lblMS">marital
															status</span></td>
													<td align="left" colspan="2">
													<span class="radio">
													<form:radiobutton path="profile.maritalStatus" tabindex="24" value="single" name="martial_status"	id="single"/><label for="single">single</label>
													</span>
													<span class="radio">
													<form:radiobutton path="profile.maritalStatus" tabindex="25" value="married" name="martial_status"	id="married"/><label for="married">married</label>
													</span>
													<form:errors path="profile.maritalStatus" cssClass="error"/>
													</td>
												</tr>

												<tr>
													<td align="right"><span class="contents"
														id="lblBirthDate">birth date</span></td>
													<td align="left" colspan="2">
													<form:select path="profile.birthMonth" class="textbox"
														tabindex="18" id="birth_month" name="birth_month">
															<option value="0" selected="selected">select
																month</option>
															<option value="january">january</option>
															<option value="february">february</option>
															<option value="march">march</option>
															<option value="april">april</option>
															<option value="may">may</option>
															<option value="june">june</option>
															<option value="july">july</option>
															<option value="august">august</option>
															<option value="september">september</option>
															<option value="october">october</option>
															<option value="november">november</option>
															<option value="december">december</option>

													</form:select> &nbsp;
													<form:errors path="profile.birthMonth" cssClass="error"/>
													
													<form:select path="profile.birthDay" class="textbox" tabindex="19"
														id="birth_day" name="birth_day">
															<option value="0" selected="selected">select day</option>
															<option value="01">01</option>
															<option value="02">02</option>
															<option value="03">03</option>
															<option value="04">04</option>
															<option value="05">05</option>
															<option value="06">06</option>
															<option value="07">07</option>
															<option value="08">08</option>
															<option value="09">09</option>
															<option value="10">10</option>
															<option value="11">11</option>
															<option value="12">12</option>
															<option value="13">13</option>
															<option value="14">14</option>
															<option value="15">15</option>
															<option value="16">16</option>
															<option value="17">17</option>
															<option value="18">18</option>
															<option value="19">19</option>
															<option value="20">20</option>
															<option value="21">21</option>
															<option value="22">22</option>
															<option value="23">23</option>
															<option value="24">24</option>
															<option value="25">25</option>
															<option value="26">26</option>
															<option value="27">27</option>
															<option value="28">28</option>
															<option value="29">29</option>
															<option value="30">30</option>
															<option value="31">31</option>

													</form:select>&nbsp; 
													<form:errors path="profile.birthDay" cssClass="error"/>
													</td>
												</tr>

												<tr>
													<td align="right"><span class="contents"
														id="lblHouseIncome">household income</span></td>
													<td align="left" colspan="2">
											
																<jsp:include page="views/income.jsp"/>
																
																</td>
												</tr>



												<tr>
													<td colspan="3">&nbsp;</td>
												</tr>



												<tr>
													<td colspan="2">&nbsp;</td>
												</tr>
												<tr>
													<td align="left" class="contents" colspan="3"><span
														style="font-weight: bold;" id="lblCont15">in
															addition to receiving your earned rewards via email, you
															will also receive sale and discount emails valid at
															calvinklein.com and certain Calvin Klein stores. you may
															edit your mailing preferences below:</span></td>
												</tr>

												<tr>
													<td colspan="2">&nbsp;</td>
												</tr>

												<tr>
													<td align="right"><span class="contents"
														id="lblEmailPref">email preferences</span></td>
													<td align="left">
													<jsp:include page="views/storeemail.jsp"/>
													</td>
													<td align="left">&nbsp;</td>
												</tr>


												<tr>
													<td class="contents" colspan="3"><b><u>by
																joining our preferred program, and providing personal
																data, you are certifying you are at least 18 years of
																age. <br> do not provide any information if you're
																	under the age of 18.
														</u></b></td>
												</tr>

												<tr>
													<td colspan="3">&nbsp;</td>
												</tr>

												<tr align="center">
													<td colspan="3">
														<input type="submit" style="font-weight:bold"													
														 class="bullets submitLink" tabindex="36"
														id="btnUpdate"
														value="update"/>
															</td>
												</tr>
												<tr class="tableCellRightAligned">
													<td align="right" class="errmsgRight" colspan="3">
														[displaying form 3 of 3]</td>
												</tr>

											<!-- </tbody> -->
										</table>



									</div>

								</td>
							</tr>
						</table>
</form:form>
						

				

				

