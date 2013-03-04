$(document).ready(function() {
	/* menu ativo - inicio */
	if ($("#inicial").length) {
		$('#homeProtected-menu').parent('li').addClass("active");
	}
	if ($("#usuarios").length) {
		$('#usuariosProtected-menu').parent('li').addClass("active");
	}
	/* menu ativo - fim */
	
	/* sidebar ativo - inicio */
	if ($("#visUsuariosProtected").length) {
		$('#visualizarProtectedMenuId').parent('li').addClass("active");
	}
	if ($("#cadastrarUsuariosProtected").length) {
		$('#cadastrarProtectedMenuId').parent('li').addClass("active");
	}
	/* sidebar ativo - fim */
});