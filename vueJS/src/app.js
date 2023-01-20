const { createApp } = Vue

createApp ({
    data() {
        return {
            name: "",
            age: 25,
            input_name: ""
        }
    },
    methods: {
        submitForm(e) {
           
            e.preventDefault();

            this.name = this.input_name;

        }
    }
}).mount("#app");