class CartItem < ActiveRecord::Base
	belongs_to :product
	belongs_to :customer

	validates :quantity_ordered, presence: true
	validates :quantity_ordered,  numericality: {greater_than_or_equal_to:  1}

	def sub_total
		product.price * quantity_ordered
	end
end
