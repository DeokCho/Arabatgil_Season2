
import Vue from 'vue'
import Vuex from 'vuex'
import counter from './counter'
import player from './player'
Vue.use(Vuex)

const state = {
    login : [],
    join : []
}
export const store = new Vuex.Store({
    modules : {
        player,
        counter
    }
})
