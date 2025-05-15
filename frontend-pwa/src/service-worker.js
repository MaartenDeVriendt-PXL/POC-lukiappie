self.addEventListener('install', (event) => {
  console.log('[Custom SW] Installed');
  self.skipWaiting();
});

self.addEventListener('activate', (event) => {
  console.log('[Custom SW] Activated');
});

self.addEventListener('fetch', (event) => {
  const url = event.request.url;

  // Pas domein aan!
  if (url.includes('https://jouw-api-of-cdn.com/images/')) {
    event.respondWith(
      caches.open('image-cache').then((cache) => {
        return cache.match(event.request).then((response) => {
          return (
            response ||
            fetch(event.request).then((networkResponse) => {
              cache.put(event.request, networkResponse.clone());
              return networkResponse;
            })
          );
        });
      })
    );
  }
});
