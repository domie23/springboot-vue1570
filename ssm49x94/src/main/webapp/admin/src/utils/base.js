const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm49x94/",
            name: "ssm49x94",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm49x94/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "共享充电宝管理系统"
        } 
    }
}
export default base
