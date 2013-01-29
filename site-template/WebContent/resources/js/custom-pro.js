$(document).ready(function() {
	/* menu ativo - inicio */
	if ($("#inicial").length) {
		$('#homeProtected-menu').parent('li').addClass("active");
	}
	if ($("#usuarios").length) {
		$('#usuariosProtected-menu').parent('li').addClass("active");
	}
	/* menu ativo - fim */
});