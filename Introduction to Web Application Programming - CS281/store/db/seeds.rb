# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#   cities = City.create([{ name: 'Chicago' }, { name: 'Copenhagen' }])
#   Mayor.create(name: 'Emanuel', city: cities.first)

products = Product.create([
{ name:  'Apples',    quantity_in_stock:  20, price:  2.15 },
{ name:  'Bananas', quantity_in_stock:  50, price:  1.25 },
{ name:  'Pears',      quantity_in_stock:  10, price:  3.50 }
])   
