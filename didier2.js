//didier.js


$(document).ready(function(e){

    $("#submit-btn").click(function(e) {
        var login = $("#login").val() ;
        var passwd = $("#password").val() ;
        alert(login) ;
        alert(passwd);
        $.post('./exemple-ajax.php',{user:login,
                                     mdp:passwd},
            function(data){
                console.log(data);
                $("#container-content").append(data);
        });

    }) ;



});

