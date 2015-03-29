class Product < ActiveRecord::Base

	validates  :name, :quantity_in_stock, :price, presence:  true
	validates  :quantity_in_stock, numericality:  {greater_than_or_equal_to:  1}
	validates  :price, numericality:  {greater_than_or_equal_to:  0.01}
	validates  :name, uniqueness:  true	
	
	has_many  :cart_items
end
