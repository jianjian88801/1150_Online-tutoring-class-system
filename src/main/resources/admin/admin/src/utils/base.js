const base = {
    get() {
        return {
            url : "http://localhost:8080/xianshangfudaoban/",
            name: "xianshangfudaoban",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xianshangfudaoban/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "线上辅导班系统"
        } 
    }
}
export default base
