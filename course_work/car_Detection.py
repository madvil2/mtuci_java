import os
import cv2
import numpy as np
 
files = [f for f in os.listdir('.') if os.path.isfile(f)]
for file in files:
    if '.mp4' in file:
        break
camera = cv2.VideoCapture(file)
camera.open(file)
car_cascade = cv2.CascadeClassifier('cars.xml')
while True:
    (grabbed,frame) = camera.read()
    resize = cv2.resize(frame, (640, 360))
    grayvideo = cv2.cvtColor(resize, cv2.COLOR_BGR2GRAY)
    cars = car_cascade.detectMultiScale(grayvideo, 1.2, 5)
    for (x,y,w,h) in cars:
     cv2.rectangle(resize,(x,y),(x+w,y+h),(0,255,0),2)
     cv2.imshow("video", resize)
    if cv2.waitKey(1)== ord('q'):
        break
camera.release()
cv2.destroyAllWindows()