<template>
    <div>
        <h2>회원가입</h2>
        <form method="post">
            <div class="container">
                <input type="text" v-model="userid" placeholder="Enter userid" name="userid" required>
                <h3>입력한 아이디 : {{userid}}</h3>

                <label><b>Password</b></label>
                <input type="password" v-model="password" placeholder="Enter Password" name="password" required>
                <h3>입력한 패스워드 : {{password}}</h3>

                <div id='example-3'> 취미
                    <input type="checkbox" id="java" value="hobbyjava" v-model="checkedNames">
                    <label for="java">Java</label>
                    <input type="checkbox" id="javaScript" value="hobbyjavascript" v-model="checkedNames">
                    <label for="javaScript">JavaScript</label>
                    <input type="checkbox" id="sql" value="hobbysql" v-model="checkedNames">
                    <label for="sql">SQL</label>
                    <br>
                    <span>체크한 이름: {{ checkedNames }}</span>
                </div>
                <br>

                <textarea v-model="message" placeholder="여러줄을 입력해보세요"></textarea><br>
                <span>입력 내용</span>
                <p style="white-space: pre-line">{{ gita }}</p>
                <br>

                성별 : <br>
                <input type="radio" id="male" value="male" v-model="gender">
                <label for="male">남성</label>
                <input type="radio" id="female" value="female" v-model="gender">
                <label for="female">여성</label>
                <br>
                <span>선택: {{ gender }}</span>

                <br>

                <select v-model="telecom"> 통신사 :
                    <option disabled value="">Please select one</option>
                    <option>SKT</option>
                    <option>KT</option>
                    <option>LG</option>
                </select>
                <span> 통신사: {{ telecom }}</span>
                <br>
                개인정보 동의 :
                <input
                        type="checkbox"
                        v-model="confirm"
                        true-value="yes"
                        false-value="no"
                >

                <button @click="join" type="submit">회원가입</button>
                <!--            <router-link to="/calculator"><button type="submit">Login</button></router-link>-->
                <label>
                    <input type="checkbox" checked="checked" name="remember"> Remember me
                </label>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <button type="button" class="cancelbtn">Cancel</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </div>

</template>

<script>
    import {mapActions} from 'vuex'
    export default {
        data(){
            return{
                userid : '',
                password : '',
                checkedNames : [],
                gender :'',
                telecom : '',
                confirm : false,
                gita : ''
            }
        },
        methods : mapActions ([
        'join'
        ])
    }
</script>

<style scoped>
    body {font-family: Arial, Helvetica, sans-serif;}
    form {border: 3px solid #f1f1f1;}

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    button:hover {
        opacity: 0.8;
    }

    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    .container {
        padding: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>