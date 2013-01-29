$(document).ready(function() {
	/* menu ativo - inicio */
	if ($("#home").length) {
		$('#home-menu').parent('li').addClass("active");
	}
	if ($("#sobre").length) {
		$('#sobre-menu').parent('li').addClass("active");
	}
	if ($("#contato").length) {
		$('#contato-menu').parent('li').addClass("active");
	}
	/* menu ativo - fim */
});