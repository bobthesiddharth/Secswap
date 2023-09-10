//jshint esversion:6


const express = require("express");
const bodyParser = require("body-parser");
const mongoose = require("mongoose");


const app = express();

app.set("view engine", "ejs");

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static("public"));

app.get("/", (req, res) => {
  res.send("Server is up and running");
});

app.get("/swap", (req, res) => {
  res.send("Server is up and running");
});
app.get("/login", (req, res) => {
  res.send("Server is up and running");
});

app.listen(3000, function (req, res) {
  console.log("Server is running on port 3000");
});
