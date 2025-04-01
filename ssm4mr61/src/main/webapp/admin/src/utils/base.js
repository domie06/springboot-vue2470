const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4mr61/",
            name: "ssm4mr61",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4mr61/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "课程辅助教学平台"
        } 
    }
}
export default base
