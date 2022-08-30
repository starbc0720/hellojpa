package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MBR")
public class Member {

    @Id
    private Long id;
    private String name;

    /*jpa는 기본적으로 기본생성자가 하나 존재해야 함, 내부적으로 reflection을 사용하기 떄문에
    동적으로 기본 생성자가 하나 존재해야 해서 다음과 같이 선언*/
    public Member(){
    }
    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
