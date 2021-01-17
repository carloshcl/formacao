 
document.getElementById('empresa').addEventListener('click',showEmpresa)
document.getElementById('jovem').addEventListener('click',showJovem)

 function showEmpresa(){
    var userEmpresa = document.getElementById("user-empresa")
    var userJovem = document.getElementById("user-jovem")
    userEmpresa.style.visibility = "visible"
    userJovem.style.visibility = "hidden"
 }

 function showJovem(){
    var userEmpresa = document.getElementById("user-empresa")
    var userJovem = document.getElementById("user-jovem")
    userEmpresa.style.visibility = "hidden"
    userJovem.style.visibility = "visible"
 }


