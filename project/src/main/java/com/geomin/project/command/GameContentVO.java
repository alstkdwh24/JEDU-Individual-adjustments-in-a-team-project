package com.geomin.project.command;


import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameContentVO {

	private Integer game_no;
	private String game_title;
	private Integer game_target_level;
	private Integer game_price;
	private Integer game_discount_price;
	private String game_content;
	private Integer game_count;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date game_sub_startDate;

	private String game_sub_endDate;
	private String game_regdate;
	private String del_check;
	private Integer user_no;
	
	private String filename;  // 작성자가 업로드한 파일명
	private String filepath;
	private String uuid;
	
	private String purchase_date;
	private int cnt;
	private String price_sum;


		

}
