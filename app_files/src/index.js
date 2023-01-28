// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyA6808ZO3VXxEhIBdnDX2J-J8mrF6GY7V0",
  authDomain: "wheres-tenders.firebaseapp.com",
  projectId: "wheres-tenders",
  storageBucket: "wheres-tenders.appspot.com",
  messagingSenderId: "829796010626",
  appId: "1:829796010626:web:d897ab73253e88b744029b",
  measurementId: "G-WYHY64MB5S"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);