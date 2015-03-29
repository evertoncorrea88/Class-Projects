require 'test_helper'

class ManagerControllerTest < ActionController::TestCase
  test "should get index" do
    get :index
    assert_response :success
  end

  test "should get show" do
    get :show,  product: {id: 1, name: "Peaches"}
    assert_response :success
  end

  test "should get find" do
    get :find, product: {id: 1, name: "Berries"}
    assert_response :success
  end

end
