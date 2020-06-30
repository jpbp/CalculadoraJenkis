function botao(num){
			let salvo = document.calc.visor.value;
			document.calc.visor.value= salvo+num;
			
		}
		
		function limpa(){
			if(document.getElementById('clear').value!="") {
				document.getElementById('visor').value="";
			}
		}
		
		
		function calcular(){
			let visor= document.calc.visor.value;
			document.getElementById('visor').value=eval(visor);
		}
