class CreateCartItems < ActiveRecord::Migration
  def change
    create_table :cart_items do |t|
      t.integer :customer_id
      t.integer :product_id
      t.integer :quantity_ordered

      t.timestamps
    end
  end
end
