<template>
    <div>
     <div>{{ count }}</div>
        <div @click="add" class="btn operator">클릭수 올리기</div>
        <div @click="clear" class="btn operator">초기화</div>
    </div>
</template>

<script>
    export default {
    data() {
        return {
            count:'0'
        }
    },
        methods :{
        clear(){
          this.count ='0'
        },
        add(){
            this.count++
        }
        }
    }
</script>

<style scoped>

</style>