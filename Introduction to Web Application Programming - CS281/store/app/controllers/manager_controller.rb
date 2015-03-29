class ManagerController < ApplicationController
  def index
  end

  def show
  	@params = params[:product]
	@product = Product.find_by_name (@params[:name])

	respond_to do |format|
		if @product != nil
			format.html
		else
			format.html { render action: "not_found" }	
		end
	end
  end

  def find
  
	@params = params[:product]
	@product = Product.find_by_id(@params[:id])

	respond_to do |format|
		if @product != nil
			format.html
		else
			format.html{ render action: "not_found" }	
		end
	end
  end
end
