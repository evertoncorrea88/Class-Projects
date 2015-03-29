class Customer < ActiveRecord::Base
	has_many  :cart_items,  dependent:  :destroy

	def add_product(id, product_id, quantity_ordered)
		cart_item =CartItem.new( customer_id: id, product_id: product_id, quantity_ordered: quantity_ordered)
		cart_items  <<  cart_item 		#appends a value
  		cart_item 						#returns a value
	 end

 	def total_price
 		cart_items.to_a.sum { |item| item.sub_total }
 	end
end
