class HomePageController < ApplicationController
	def index
	end

	def list
		@products = Product.order(:name)
	end

	def find
		@params = params[:product]
		@product = Product.find_by_name (@params[:name])

		respond_to do |format|
			if @product != nil
				format.html {render action: :show}
			else
				format.html { render action: :not_found }	
			end
		end	
	end

	def show
		id = params[:item][:id]
		@product = Product.find(id)

		respond_to do |format|
			if @product != nil
				format.html
			else
				format.html{render action: "not_found"}
			end
		end
	end
	
	def verify
		@params = params[:user]
		user = User.find_by_username(@params[:username])
		password = @params[:password]

		respond_to do |format|
			if user and user.authenticate(password)   
				format.html { redirect_to(manager_index_url, notice: 'Authorized') }
			else
				format.html { render action: "login_error"}
			end
		end
	end
	
	def add_to_cart
		@customer = customer
		@params = params[:product]
		quantity_ordered = @params[:quantity_ordered]
		product = Product.find_by_id(@params[:id])
		@cart_item = @customer.add_product(customer.id, product.id, quantity_ordered)
		
		respond_to do |format|
			if @cart_item.save
				format.html {render action: "show_cart"}
			else
				format.html { render  action: "index" }
			end
		end
	end

	def show_cart
		if customer != nil
			@customer = customer
			respond_to do |format|
				format.html 		# show_cart.html.erb
			end
		else
			format.html { render action: “index” }
		end
	end
	
	def check_out
		@customer = customer
		id = @customer.id
		respond_to  do |format|
			format.html{redirect_to  edit_customer_url(id)}
   		end
	end

	
end
