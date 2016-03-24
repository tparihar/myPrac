$(document)
		.ready(
				function() {
					$('#state').prop('disabled', true);
					$('#store').prop('disabled', true);
					$('#country')
							.change(
									function() {

										var countryId = $("#country").val();
										if (countryId == 0) {
											$('#state').prop('disabled', true);
											return;
										}
										$
												.ajax({
													type : "GET",
													url : "stateList",
													data : {
														"country" : countryId
													},
													success : function(xhr) {
														$('#state').prop(
																'disabled',
																false);
														var response = jQuery
																.parseJSON(xhr);
														$('#state').find(
																'option')
																.remove();
														$('#state')
																.append(
																		"<option selected='selected' value='0' ToolTip=''>select your state</option>");
														$
																.each(
																		response,
																		function(
																				key,
																				value) {
																			$(
																					"#state")
																					.append(
																							"<option value='"
																									+ key
																									+ "'>"
																									+ value
																									+ "</option>");
																		});
													}
												});
									})

					$('#state')
							.change(
									function() {
										var stateId = $("#state").val();
										if (stateId == 0) {
											$('#store').prop('disabled', true);
											return;
										}
										$
												.ajax({
													type : "GET",
													url : "storeList",
													data : {
														"state" : stateId
													},
													success : function(xhr) {
														$('#store').prop(
																'disabled',
																false);
														var response = jQuery
																.parseJSON(xhr);
														$('#store').find(
																'option')
																.remove();
														$('#store')
																.append(
																		"<option selected='selected' value='0' ToolTip=''>select your home store</option>");
														$
																.each(
																		response,
																		function(
																				key,
																				value) {
																			$(
																					"#store")
																					.append(
																							"<option value='"
																									+ key
																									+ "'>"
																									+ value
																									+ "</option>");
																		});
													}
												});
									})

				})

function validateEmail() {
	$('#emaillabel').text("")
	$('#user').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	var email = $.trim($("input[name='user.email']").val());
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if (email == "") {
		$('#user').css({
			"border" : 'red 1px solid'
		});
		$('#emaillabel').text("Email field cannot be empty")
		$('#user').focus();
		return;
	}
	if (email.match(mailformat)) {
		$.ajax({
			type : "GET",
			url : "email",
			data : {
				"email" : email
			},
			success : function(xhr) {
				var response = jQuery.parseJSON(xhr);
				console.log(response)
				if (response) {

					$('#emaillabel').text(
							"Someone already has that username. Try another?")
					$('#user').css({
						"border" : 'red 1px solid'
					});
					$('#user').focus();
				} else {
					return;
				}
			}
		});

	} else {
		$('#emaillabel').text("Email Id must be in form : adhi@gmail.com")
		$('#user').css({
			"border" : 'red 1px solid'
		});
		$('#user').focus();
		return;
	}
}

function validatePassword() {
	$('#pwdlabel').text("")
	$('#pwd').css({
		"border" : '#A4A4A4 1px solid'
	});
	var password = $.trim($("input[name='user.password']").val());
	var passwordFormat = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
	if (password == "") {
		$('#pwdlabel').text("Password field cannot be empty")
		$('#pwd').css({
			"border" : 'red 1px solid'
		});
		$('#pwd').focus();
		return;
	} else if (password.match(passwordFormat)) {
		return;
	} else {
		$('#pwdlabel')
				.text(
						"Password must contain atleast six characters with one uppercase, one lowercase, one number : Asha12")
		$('#pwd').css({
			"border" : 'red 1px solid'
		});
		$('#pwd').focus();
	}

}

function validate() {

	validateEmail();
	validatePassword();

	$('#pwdlabel').text("")
	$('#pwd').css({
		"border" : '#A4A4A4 1px solid'
	});

	$('#perlabel').text("")
	$('#fname').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	$('#lname').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	$('#country1').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	$('#state1').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	$('#addr1').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	$('#city').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	$('#zip').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	var fname = $.trim($("input[name='firstName']").val());
	var lname = $.trim($("input[name='lastName']").val());
	var country = $.trim($("input[name='adr.country']").val());
	var state = $.trim($("input[name='adr.state']").val());
	var addr1 = $.trim($("input[name='adr.address1']").val());
	var addr2 = $.trim($("input[name='adr.address2']").val());
	var city = $.trim($("input[name='adr.city']").val());
	var zip = $.trim($("input[name='adr.zip']").val());

	if (fname.match(/^[A-z]+$/)) {
		if (lname == "") {
			$('#lname').focus();
			return;
		} else if (lname.match(/^[A-z]+$/)) {
			if (country == "") {
				$('#country1').focus();
				return;
			} else if (country.match(/^[A-z]+$/)) {
				if (state == "") {
					$('#state1').focus();
					return;
				} else if (state.match(/^[A-z]+$/)) {
					if (addr1 == "") {
						$('#addr1').focus();
						return;
					} else if (addr1.match(/^[a-zA-Z0-9 ]+$/)) {
						if (city == "") {
							$('#city').focus();
							return;

						} else if (city.match(/^[A-z]+$/)) {
							if (zip == "") {
								$('#zip').focus();
								return;

							} else if (zip.match(/^[0-9]+$/)) {
								return;
							} else {
								$('#perlabel').text(
										" Zip fields can contain only numbers")
								$('#zip').css({
									"border" : 'red 1px solid'
								});
								$('#zip').focus();
								return;
							}
							return;
						} else {
							$('#perlabel')
									.text(
											" City fields cannot contain special charaters")
							$('#city').css({
								"border" : 'red 1px solid'
							});
							$('#city').focus();
							return;
						}
						return;
					} else {
						$('#perlabel')
								.text(
										" Address fields cannot contain special charaters")
						$('#addr1').css({
							"border" : 'red 1px solid'
						});
						$('#addr1').focus();
						return;
					}
				} else {
					$('#perlabel')
							.text(
									"State fields cannot contain numbers or special charaters")
					$('#state1').css({
						"border" : 'red 1px solid'
					});
					$('#state1').focus();
					return;
				}
			} else {
				$('#perlabel')
						.text(
								"Country fields cannot contain numbers or special charaters")
				$('#country1').css({
					"border" : 'red 1px solid'
				});
				$('#country1').focus();
				return;
			}
		} else {
			$('#perlabel').text(
					"Name fields cannot contain numbers or special charaters")
			$('#lname').css({
				"border" : 'red 1px solid'
			});
			$('#lname').focus();
			return;
		}
	} else {
		$('#perlabel').text(
				"Name fields cannot contain numbers or special charaters")
		$('#fname').css({
			"border" : 'red 1px solid'
		});
		$('#fname').focus();
		return;
	}
	validatePhone();
	validateAemail()

}
function validatePhone() {
	var phone = $.trim($("input[name='phone']").val());
	$('#perlabel').text("")
	$('#phone').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	if (phone == "") {
		return;
	} else if (phone == /^[0-9]*$/) {
		return;
	} else {
		$('#perlabel').text(
				"phone field can only contain numbers with max limit 10")
		$('#phone').css({
			"border" : 'red 1px solid'
		});
		$('#phone').focus();
	}
}

function validateAemail() {
	var aEmail = $.trim($("input[name='emailId']").val());
	$('#perlabel').text("")
	$('#aemail').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	if (aEmail == "") {
		return;
	} else if (aEmail.match(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/)) {
		return;
	} else {
		$('#perlabel').text("Email Id must be in form : adhi@gmail.com")
		$('#aemail').css({
			"border" : 'red 1px solid'
		});
		$('#aemail').focus();
	}
}
/*
 * var strongRegex = new
 * RegExp("^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\W).*$", "g"); var
 * mediumRegex = new
 * RegExp("^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$",
 * "g"); var enoughRegex = new RegExp("(?=.{6,}).*", "g"); var pwd =
 * document.getElementById("pwd"); if (pwd.value.length==0) { strength.innerHTML =
 * 'Type Password'; } else if (false == enoughRegex.test(pwd.value)) {
 * strength.innerHTML = 'More Characters'; } else if
 * (strongRegex.test(pwd.value)) { strength.innerHTML = '<span
 * style="color:green">Strong!</span>'; } else if (mediumRegex.test(pwd.value)) {
 * strength.innerHTML = '<span style="color:orange">Medium!</span>'; } else {
 * strength.innerHTML = '<span style="color:red">Weak!</span>'; } }
 */
function validateEmail1() {
	$('#dynamic').css({
		"color" : '#ffffff'
	});
	$('#dynamic').text("*")
	$('#emaillogin').text("")
	$('#user1').css({
		"border" : '#A4A4A4 1.2px solid'
	});
	var email = $.trim($("input[name='email']").val());
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if (email == "") {
		$('#user1').css({
			"border" : 'red 1px solid'
		});
		$('#emaillogin').text("Email field cannot be empty")
		$('#user1').focus();
		return;
	}
	if (email.match(mailformat)) {

		return;

	} else {
		$('#emaillogin').text("Email Id must be in form : adhi@gmail.com")
		$('#user1').css({
			"border" : 'red 1px solid'
		});
		$('#user1').focus();
		return;
	}
}
