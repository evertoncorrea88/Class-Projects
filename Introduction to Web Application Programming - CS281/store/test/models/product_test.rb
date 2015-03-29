require 'test_helper'

class ProductTest < ActiveSupport::TestCase
	test "product price must be positive" do
		product = Product.new(name:  "Melons", quantity_in_stock:  5)
    
		product.price = -1
		assert product.invalid?
		assert_equal "must be greater than or equal to 0.01", product.errors[:price].join('; ')
      
		product.price = 0
		assert product.invalid?
		assert_equal "must be greater than or equal to 0.01", product.errors[:price].join('; ')
      
		product.price = 1
		assert product.valid?
		
	end
	
	test "product quantity must be positive" do
		product = Product.new(name:  "Melons2", price:  10)
		
		product.quantity_in_stock = -1
		assert product.invalid?
		assert_equal "must be greater than or equal to 1", product.errors[:quantity_in_stock].join('; ')
      
		product.quantity_in_stock = 0
		assert product.invalid?
		assert_equal "must be greater than or equal to 1", product.errors[:quantity_in_stock].join('; ')
      
		product.quantity_in_stock = 1
		assert product.valid?
	end
end


