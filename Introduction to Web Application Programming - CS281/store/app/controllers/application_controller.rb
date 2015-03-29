class ApplicationController < ActionController::Base
	@@order_number = 0
	protect_from_forgery with:  :exception

	private
	def customer
		Customer.find(session[:customer_id])
		rescue ActiveRecord::RecordNotFound		# Used if this is the first item added to the cart.
		customer = Customer.create
		session[:customer_id] = customer.id
		customer		# returns a value
	end
end
