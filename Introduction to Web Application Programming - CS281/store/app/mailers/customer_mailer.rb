class CustomerMailer < ActionMailer::Base
 	 default from: "rubyclasspace@gmail.com"
 	 
  		def confirmation_email(customer, number)
    			@customer = customer
    			@order_number = number
    			mail(to: @customer.email, subject: "Order Received - Thank you.")
 		 end
end
