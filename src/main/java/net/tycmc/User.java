package net.tycmc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import h2o.common.util.io.StreamUtil;
import lombok.Data;

@Data
public class User {
	
	private Integer id;
	
	private String name;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		
			StringBuilder fc = new StringBuilder();

			br = new BufferedReader(h2o.common.util.io.StreamUtil.readFile("d:/zhangt.txt"));
			String l;
			while ((l = br.readLine()) != null) {
				fc.append("<row>" + l + "</row>");
			}
			StreamUtil.close(br);
        
			System.out.println(fc);
		
		
	}

}
