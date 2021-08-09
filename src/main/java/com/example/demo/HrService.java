package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class HrService {
	@Autowired
	static
	RegionRepository regionRepository;
		public static List<Region> getAllRegion()
		{
			return (List<Region>) (regionRepository.findAll());
			
		}
		public static Region getRegionById(int id)
		{
			 return regionRepository.findById(id).orElse(null);
			
		}
		
		
		public static Region addOrUpdateRegion(Region region)
		{return regionRepository.save(region);}
		
		
		public static Region deleteRegion(int id) throws Exception
		{
			Region deleteRegion=null;
			try {
				deleteRegion=regionRepository.findById(id).orElse(null);
				if(deleteRegion==null)
				{throw new Exception("Region not available"); }
				else {
					regionRepository.deleteById(id);
				}
			}
			catch(Exception E)
			{
				throw E;
			}
			return deleteRegion;
			
		}
		

	}


