package dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Song {
	@Id
	@Column(name="songId")
	private int id;
	@Column(name="songName")
	private String songName;
	@Column(name="singer")
	private String artist;
	
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song(int id, String songName, String artist) {
		super();
		this.id = id;
		this.songName = songName;
		this.artist = artist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", artist=" + artist + "]";
	}
	

}
