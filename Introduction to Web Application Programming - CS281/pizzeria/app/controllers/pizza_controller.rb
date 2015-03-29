class PizzaController < ApplicationController
	def index
		@time = Time.now.to_s
	end

	def order
		@params = params[:pizza]

		@name = @params[:name]
		@email = @params[:email]      
		@crust = @params[:crust]
		@size = @params[:size]
          
		@toppings = Array.new
		if @params[:mushrooms] == "1"
			@toppings << "Mushrooms"
		end
		if @params[:pepperoni] == "1"
			@toppings << "Pepperoni"
		end
		if @params[:vegetables] == "1"
			@toppings << "Vegetables"
		end

		@delivery_year = @params["delivery_date(1i)"]
		@delivery_month = @params["delivery_date(2i)"]
		@delivery_day = @params["delivery_date(3i)"]
    
		@delivery_hour = @params["delivery_time(4i)"]
		@delivery_minute = @params["delivery_time(5i)"]
      
		@address = @params[:address]       
		@telephone = @params[:telephone]
 
		respond_to do |format|
			format.html
		end
	end

	def update_time
		render(:update) do |page|
			page[time_div].replace_html @time
		end
	end
end
