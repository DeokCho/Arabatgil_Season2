export const increment = state =>{
    state.count++
    state.history.push('increment')
}
export const decrement = state => {
    state.count--
    state.history.push('decrement')
}
export const popup = ()=>{
    alert('1')
}

export const memberjoin = () => {
    alert('1')
}
