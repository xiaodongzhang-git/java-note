class Dept {
    private long deptno ;
    private String dname ;
    private String loc ; //必须有private

    public Dept() {} //必须有无参
    public Dept(long deptno, String dname, String loc) {
        this.deptno = deptno ;
        this.dname = dname ;
        this.loc = loc ;
    }

    public String getInfo() {
        return this.deptno + ":" + this.dname + ":" + this.loc ;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno ;
    }
    public void setDname(String dname) {
        this.dname = dname ;
    }
    public void setLoc(String loc) {
        this.loc = loc ;
    }

    public long getDeptno() {
        return this.deptno ;
    }
    public String getDname() {
        return this.dname ;
    }
    public String getLoc() {
        return this.loc ;
    }
}

public class SimpleJavaDemo {
    public static void main(String[] args) {
        Dept dept = new Dept(100, "开发部门", "火星");
        System.out.println(dept.getInfo());
    }
}
