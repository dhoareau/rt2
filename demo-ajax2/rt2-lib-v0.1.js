//rt2-lib-v0.1.js
$(document).ready(function() {

    $("#chat-window-btn").click(function(e){
        $("#chat-window").slideToggle(3000) ;
    });


    $("#btn").click(function(e){
        e.preventDefault() ;

        var text = $("#garfield").val() ;
        //console.log(text);

        //$("li").fadeOut(3000).fadeIn(1000) ;
        $("#chat-window").append(">"+text+"<br/>");

        $.post("./chat.php",{chat : text},function(data){
            $("#chat-window").append(">"+data+"<br/>");            
        }) ;

    });




}) ;




