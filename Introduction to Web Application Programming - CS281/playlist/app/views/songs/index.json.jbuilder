json.array!(@songs) do |song|
  json.extract! song, :id, :artsit, :title, :label
  json.url song_url(song, format: :json)
end
