json.array!(@products) do |product|
  json.extract! product, :id, :name, :quantity_in_stock, :price
  json.url product_url(product, format: :json)
end
