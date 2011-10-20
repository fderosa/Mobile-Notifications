package mobile.notif

class MoneyRequestController {

    def index = { }
	
	def form = {		
		def staticContent = "Target mobile:"
		[ content: staticContent]
		}
	
	def ediRequest = {
		//acá deberíamos procesar los parametros y hacer el post a google
		//
		}
}
