# -*- coding: utf-8 -*-
"""
Created on Mon Jul  5 12:57:17 2021

@author: aselw
"""
# from pathlib import Path
# import shutils
# from zipfile import ZipFile
# import json 
# import sqlite3 
# import webbrowser
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import smtplib

message = MIMEMultipart()
message["from"] = "me man"
message["to"] = "wmail"
message["subject"] = "this is a test "
message.attach(MIMEText("Body"))
sm = smtplib.SMTP(host="", port=587)

# print("deployment completed")
# webbrowser.open("https://www.google.com/")


# with ZipFile("files.zip", "w") as zip:
#     for path in Path("dirname").rglob("*.*"):
#         zip.write(path)
        
        
# #json files 
# movies = [
#     {"id": 1, "title: term", "year": 1989},
#     {"id": 2, "title: kop", "year": 1992}
# ]

# data = json.dumps(movies)
# print(data)

# #sqllite files 
# movies = json.loads(Path("movies.json").read_text())

