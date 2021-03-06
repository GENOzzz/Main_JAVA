package svc;

import java.util.Scanner;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {
	Scanner scan=new Scanner(System.in);
	public Member searchMemberById(String searchValue) {
		Member member=null;
			for(int i=0;i<MemberUI.memberArray.length;i++) {//회원 명단 만큼 반복
				if(MemberUI.memberArray[i].getId()==Integer.parseInt(searchValue)) {
					member=MemberUI.memberArray[i];//입력받은 회원의 ID와 동일한 ID가 있으면
					break;
				}
			}
		return member;//해당 멤버 리턴
	}
	public Member searchMemberByNick(String searchValue) {
		Member member=null;
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(MemberUI.memberArray[i].getNick().equals(searchValue)) {
				member=MemberUI.memberArray[i];//입력받은 회원의 Nick과 동일한 Nick이 있으면
				break;
			}
		}
		return member;//해당 멤버 리턴
	}
	public Member[] searchMemberByName(String searchValue) {
		Member[]searchMemberArray=null;
		int count=0;//중복되는 회원을 count
		Member[]tempArray=new Member[MemberUI.memberArray.length];
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getName())) {
				tempArray[count++]=MemberUI.memberArray[i];//동일한 이름의 회원을 temp배열에 저장
			}
		}
		searchMemberArray=new Member[count];//temp배열의 크기만큼 배열크기 선정
		for(int i=0;i<count;i++) {
			searchMemberArray[i]=tempArray[i];//temp배열에 저장되있는 회원 복사.
		}
		return searchMemberArray;//해당 배열 리턴.
	}
	
	public Member[] searchMemberByHobby(String searchValue) {
		Member[]searchMemberArray=null;
		int count=0;
		Member[]tempArray=new Member[MemberUI.memberArray.length];
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getHobby())) {
				tempArray[count++]=MemberUI.memberArray[i];//동일한 취미의 회원들을 temp에 저장
			}
		}
		searchMemberArray=new Member[count];
		for(int i=0;i<count;i++) {
			searchMemberArray[i]=tempArray[i];//temp배열에 저장되어있는 회원 복사
		}
		return searchMemberArray;
	}
}
