const express = require('express')
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 5000;

// Where we will keep books
let people = 
    [
        { id: 1, firstname: "Emma", lastname: "Taylor" },
        { id: 2, firstname: "Liam", lastname: "Johnson" },
        { id: 3, firstname: "Sophia", lastname: "Brown" },
        { id: 4, firstname: "Noah", lastname: "White" },
        { id: 5, firstname: "Ava", lastname: "Martinez" },
        { id: 6, firstname: "Elijah", lastname: "Clark" },
      ];

app.use(cors());

// Configuring body parser middleware
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.post('/people', (req, res) => {
    const person = req.body;
});

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`));