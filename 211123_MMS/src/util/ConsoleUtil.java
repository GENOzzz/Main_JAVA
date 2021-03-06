package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import vo.Member;
import vo.SearchData;
import util.intcheck;

public class ConsoleUtil {

	public Member getNewMember(java.util.Scanner scan){
		intcheck intcheck=new intcheck();
		Member newMember=new Member();
		System.out.println("======새 회원 정보 등록======(띄어쓰기금지)"); //객체를 만드는 것과 등록하는것을 별개로 생각하고 코드를 작성할것.
		System.out.print("회원 아이디 : ");							//겍체를 만들때 온전한 객체가 만들어지도록(아이디가 정상적인지 이메일,전화번호 등이 맞는 형식인지 등등)
		int id =intcheck.checkk(scan.next());					//객체를 등록할때 이미 만들어진 객체가 등록이 가능한지 아닌지 등등.
		System.out.print("회원 이름 : ");
		String name=scan.next();
		System.out.print("회원 이메일 : ");
		String email = scan.next();
		System.out.print("회원 주소 : ");
		String addr = scan.next();
		System.out.print("회원 취미 : ");
		String hobby = scan.next();
		System.out.print("회원 전화번호 : ");
		String tel = scan.next();
		System.out.print("회원 닉네임 : ");
		String nick = scan.next();
		System.out.print("회원 나이 : ");
		int age = intcheck.checkk(scan.next());

		newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setNick(nick);
		newMember.setAge(age);
		return newMember;
	}
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "회원 등록 성공");
	}
	public void printRegistFailMessage(int id) {
		System.out.println(id + "회원 등록 실패");
	}
	public void printMemberList(Member[] memberArray) {
		if(memberArray.length==0) {
			System.out.println("추가된 회원 정보가 없습니다.");
		}else {
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
	public int getId(String msgKind,java.util.Scanner scan) {//msgKind =>"삭제할","검색할" 등
		intcheck intcheck=new intcheck();
		System.out.print(msgKind + "아이디 : ");
		int s=intcheck.checkk(scan.next());
		return s;
		//사용자가 입력한 아이디를 바로 return해 준다. 
	}
	public Member getNewMember(Member oldMember,java.util.Scanner scan) throws InputMismatchException{
		intcheck intcheck=new intcheck();
		Member member=new Member();
		if(oldMember==null) {
			System.out.println("아이디가 존재하지 않습니다.ㅋ");
		}
		else {
			while(true) {
				try {
					System.out.println("====새 회원 정보 수정====");
					System.out.println("아이디,닉네임은 변경불가____");
					System.out.println("회원 아이디 : "+oldMember.getId());
					System.out.println("이전 이름 : "+oldMember.getName());
					System.out.print("새 회원 이름  : ");
					String name=scan.next();
					System.out.println("이전 이메일 : "+oldMember.getEmail());
					System.out.print("새 회원 이메일 : ");
					String email=scan.next();
					System.out.println("이전 주소 : "+oldMember.getAddr());
					System.out.print("새 회원 주소 : ");
					String addr = scan.next();
					System.out.println("이전 취미 : "+oldMember.getHobby());
					System.out.print("새 회원 취미 : ");
					String hobby = scan.next();
					System.out.println("이전 전화번호 : "+oldMember.getTel());
					System.out.print("새 회원 전화번호 : ");
					String tel = scan.next();
					System.out.println("이전 나이 : "+oldMember.getAge());
					System.out.print("새 회원 나이 : ");
					int age=intcheck.checkk(scan.next());
					
					member.setId(oldMember.getId());
					member.setNick(oldMember.getNick());
					member.setName(name);
					member.setEmail(email);
					member.setAddr(addr);
					member.setHobby(hobby);
					member.setTel(tel);
					member.setAge(age);
					
					break;
				}catch(Exception e) {
					scan.next();
					e.printStackTrace();
					throw e;
				}
		}
		}return member;
	}
	public void printUpdateSuccessMessage(int id) {
		System.out.println(id + " 회원 정보 수정 성공");
	}
	public void printUpdateFailMessage(int id) {
		System.out.println("회원 정보 수정 실패");
	}
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id + "회원 정보 삭제 성공");
	}
	public void printDeleteFailMessage(int id) {
		System.out.println(id + " 회원 정보 삭제 실패");
	}
	public SearchData getSearchData(java.util.Scanner scan) {
		intcheck intcheck = new intcheck();
		String searchCondition=null;
		String searchValue=null;
		System.out.println("검색 조건을 선택하시오.");
		System.out.println("1. 아이디");
		System.out.println("2. 이름");
		System.out.println("3. 닉네임");
		System.out.println("4. 취미");
		while(true) {
			System.out.print("검색 조건 : ");
			searchCondition = scan.next();//검색 조건 선택
			searchValue=null; //검색 값
			if(searchCondition.equals("아이디")||searchCondition.equals("1")){
				System.out.print("검색할 아이디 : ");
				int s=intcheck.checkk(scan.next());//정수인지 아닌지 확인한 후
				String c=String.valueOf(s);//다시 String으로 타입 변환후
				searchValue=c; //searchValue에 저장.
				break;
			}else if(searchCondition.equals("이름")||searchCondition.equals("2")) {
				System.out.print("검색할 이름 : ");
				searchValue = scan.next();
				break;
			}else if(searchCondition.equals("닉네임")||searchCondition.equals("3")) {
				System.out.print("검색할 닉네임 : ");
				searchValue=scan.next();
				break;
			}else if(searchCondition.equals("취미")||searchCondition.equals("4")) {
				System.out.print("검색할 취미 : ");
				searchValue=scan.next();
				break;
			}else {
				System.out.println("옳바른 검색을 부탁드립니다.");
			}
		}
		//리턴할 값이 두개이므로 리턴할 값을 속성으로 저장할 클래스 설계
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);	
		searchData.setSearchValue(searchValue);
		return searchData;
	}
	
	public void printSearchMember(Member member) {
		if(member == null) {
			System.out.println("검색한 결과가 없습니다.");
		}else{
			System.out.println("아이디 : "+member.getId()+"로 검색한 결과 ");
			System.out.println(member);
		}
	}
	public void printSearchMemberArray(Member[]memberArray) {
		if(memberArray.length==0) {
			System.out.println("이름으로 검색한 결과가 없습니다.");
		}else {
			System.out.println("이름으로 검색한 결과 ");
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
	public void printSearchMemberArrayN(Member member) {
		if(member==null) {
			System.out.println("닉네임으로 검색한 결과가 없습니다.");
		}else {
			System.out.println("닉네임 : "+member.getNick()+"으로 검색한 결과");
			System.out.println(member);
		}
	}
	public void printSearchMemberArrayH(Member[]memberArray) {
		if(memberArray.length==0) {
			System.out.println("취미로 검색한 결과가 없습니다.");
		}else {
			System.out.println("취미로 검색한 결과");
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
}