class CreateSongs < ActiveRecord::Migration
  def change
    create_table :songs do |t|
      t.string :artsit
      t.string :title
      t.string :label

      t.timestamps
    end
  end
end
