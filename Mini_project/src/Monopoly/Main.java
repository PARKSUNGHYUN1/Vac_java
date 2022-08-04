package Monopoly;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Map> arr = new ArrayList<>();
		String[] list = {"출발지", "방콕", "황금카드", "베이징", "독도(관)", "타이페이", "두바이", "카이로", "무인도"
		        ,"발리(관)" , "도쿄" , "시드니" , "황금카드" , "퀘백" , "하와이(관)" ,"상파울로","국세청" 
		        ,"프라하" ,"푸켓(관)" ,"베를린" , "황금카드", "모스크바" , "제네바" , "로마" , "세계여행" 
		        ,"타히티(관)" ,"런던" ,"파리", "황금카드", "뉴욕" , "세금환급" , "서울"};
		arr.add(new Map(list[0]));
		arr.add(new Map(list[1], 500, 3));	// 도시, 기본통행세(토지비용), 건물 수 
		// 황금카드 자리
		arr.add(new Map(list[3], 500, 3));
		arr.add(new Map(list[4], 30));
		arr.add(new Map(list[5], 500, 3));
		arr.add(new Map(list[6], 500, 3));
		arr.add(new Map(list[7], 500, 3));
		// 무인도 자리
		arr.add(new Map(list[9], 30));
		arr.add(new Map(list[10], 700, 3));
		arr.add(new Map(list[11], 700, 3));
		// 황금카드 자리
		arr.add(new Map(list[13], 700, 3));
		arr.add(new Map(list[14], 30));
		arr.add(new Map(list[15], 700, 3));
		// 국세청 자리
		arr.add(new Map(list[17], 900, 3));
		arr.add(new Map(list[18], 30));
		arr.add(new Map(list[19], 900, 3));
		// 황금카드 자리
		arr.add(new Map(list[21], 900, 3));
		arr.add(new Map(list[22], 900, 3));
		arr.add(new Map(list[23], 900, 3));
		// 세계여행 자리
		arr.add(new Map(list[25], 30));
		arr.add(new Map(list[26], 1000, 3));
		arr.add(new Map(list[27], 1000, 3));
		// 황금카드 자리
		arr.add(new Map(list[29], 1000, 3));
		// 세급환급 자리
		arr.add(new Map(list[31], 1000, 3));
		
		System.out.println(arr.get(0).getCommonName());
	}

}
