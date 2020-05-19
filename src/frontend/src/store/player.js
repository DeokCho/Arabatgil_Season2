const state = {
    userid : '',
    passwd : ''
}

const actions = {
    login({commit}){
        commit('popup')
    },
    join({commit}){
        commit('memberjoin')
    }
}

const mutations = {
    login(){
        alert('로그인완료')
    },
    join(){
        alert('가입')
    }
}

const getters = {

}

export default {
    name: 'player',
    namespace : true,
    state,
    actions,
    mutations,
    getters

}