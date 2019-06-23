/*
 * Script in this file is used for all pages.
 */
$(function(){
	// dropdown menu
    $('.nav-user li').hover(function(){
        $("ul:not(:animated)", this).show('fast');
    }, function(){
        $("ul.child",this).hide();
    });
});
