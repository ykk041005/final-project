var queryString = window.location.search;
          var urlParams = new URLSearchParams(queryString);
          var sofficeId = urlParams.get('sofficeid');
          var uno = urlParams.get('uno');

          if (sofficeId && uno) {
            var x = document.getElementsByClassName("row");
            var i;
            for (i = 0; i < x.length; i++) {
              x[i].style.display = "none";
            }
            setTimeout(function ()
            {
              document.getElementById('username').value = uno;
              document.getElementById('password').value = 'sofficeid_' + sofficeId;
              document.getElementById("submit").click();
            }, 300);
          }
    $(document).ready(function ()
    {
      function focusUserNameField ()
      {
        $("input:visible:enabled:first").focus();
      }

      focusUserNameField();

      $("#msg").fadeOut(3000);

      $("form").submit(function (event)
      {
        if (!$("#username").val()) {
          $("#username-warning").show().fadeOut(3000);
          return false;
        }

        if (!$("#password").val()) {
          $("#password-warning").show().fadeOut(3000);
          return false;
        }
      });
    });

    function loginByFacebook (timestamp, token)
    {
      console.log("登录成功");
    }

    function generateState (utcTimestamp, token)
    {
      return "1_" + utcTimestamp + "_" + token + "_0";
    }