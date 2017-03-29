package com.rs.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.ws.model.AlbumModel;
import com.ws.model.UserModel;

@Controller
public class SubscribtionController 
{
  public static final String uri_string="https://jsonplaceholder.typicode.com";
  
  @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
   public ModelAndView getPosts(ModelMap map,@PathVariable("id")String id)
   {
	   RestTemplate restTemplate = new RestTemplate();
       UserModel bean=restTemplate.getForObject(uri_string+"/posts/"+id, UserModel.class,2);
       map.addAttribute("view_post", bean);
	   return new ModelAndView("view_post");   
   }
  
  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public ModelAndView getAllPosts(ModelMap map)
  {
	   RestTemplate restTemplate = new RestTemplate();
	   ResponseEntity<UserModel[]> responseEntity = restTemplate.getForEntity(uri_string+"/posts", UserModel[].class);
	   Object[] objects = responseEntity.getBody();
	   map.addAttribute("view_post", objects);
      return new ModelAndView("list_post");   
  }
      
  @RequestMapping(value = "/albums", method = RequestMethod.GET)
  public ModelAndView getAlbum(ModelMap map)
  {
	   RestTemplate restTemplate = new RestTemplate();
	   ResponseEntity<AlbumModel[]> responseEntity = restTemplate.getForEntity(uri_string+"/albums", AlbumModel[].class);
	   Object[] objects = responseEntity.getBody();

	   map.addAttribute("view_album", objects);
	   return new ModelAndView("list_album");   
  }
  
  @RequestMapping(value = "/albums/{id}", method = RequestMethod.GET)
  public ModelAndView getAllAlbum(ModelMap map,@PathVariable("id")String id)
  {
	   RestTemplate restTemplate = new RestTemplate();
	   AlbumModel bean = restTemplate.getForObject(uri_string+"/albums/"+id, AlbumModel.class,2);
      map.addAttribute("view_album", bean);
	   return new ModelAndView("view_album");   
  }
}
