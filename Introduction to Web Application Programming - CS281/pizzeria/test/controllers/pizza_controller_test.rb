require 'test_helper'

class PizzaControllerTest < ActionController::TestCase
  test "should get index" do
    get :index
    assert_response :success
  end

  test "should get order" do
    get :order
    assert_response :success
  end

end
