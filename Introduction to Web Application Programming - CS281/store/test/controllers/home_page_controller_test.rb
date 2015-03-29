require 'test_helper'

class HomePageControllerTest < ActionController::TestCase
  test "should get index" do
    get :index
    assert_response :success
  end

  test "should get list" do
    get :list
    assert_response :success
  end

#  test "should get find" do
 #   get :find
  #  assert_response :success
  #end
  
	test "should get find" do
		get  :find, product: { name:  "Bananas" }
		assert_response :success
	end

#  test "should get show" do
 #   get :show
  #  assert_response :success
 # end

	test "should get show" do
		get :show, item:  {id:  1}
		assert_response :success
	end


end
